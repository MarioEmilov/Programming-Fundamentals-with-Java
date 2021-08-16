import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"George, Peter, Bill, Tom" -> ", " -> [George, Peter, Bill, Tom]
        List<String> racers = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        //име на състезател -> дистанция (0)
        racers.forEach(racer -> racersDistances.put(racer, 0));

        //Регекси
        String regexLetter = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexLetter);

        String regexNumber = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexNumber);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            //"G4e@55or%6g6!68e!!@"
            //всички букви -> име на състезателя
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            //всичи цифри -> сумираме = дистанция на състезателя
            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String racerName = nameBuilder.toString();
            if (racersDistances.containsKey(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        //sorting map по descending distance (value)
        /*List<String> firstThreeNames = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //sorted map by value
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());*/

        Map<String, Integer> sortedMap = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //sorted map by value
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));

        List<String> firstThreeNames = new ArrayList<>();
        sortedMap.entrySet().forEach(entry -> firstThreeNames.add(entry.getKey()));

        //["George", "Peter", "Pesho"]
        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));
    }
}
