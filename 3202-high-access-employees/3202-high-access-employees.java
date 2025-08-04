class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
    Map<String, List<Integer>> map = new HashMap<>();

    for (List<String> entry : access_times) {
        String name = entry.get(0);
        String timeStr = entry.get(1);
        int minutes = convertToMinutes(timeStr);
        map.computeIfAbsent(name, k -> new ArrayList<>()).add(minutes);
    }

    List<String> result = new ArrayList<>();

    for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
        List<Integer> times = entry.getValue();
        System.out.print(entry.getKey()+": ");
        Collections.sort(times);
        System.out.print(times+" ");
        for (int i = 2; i < times.size(); i++) {
            if (times.get(i) - times.get(i - 2) < 60) {
                result.add(entry.getKey());
                break;
            }
        }
    }

    return result;
}

private int convertToMinutes(String time) {
    //String[] parts = time.split(":");
    int hour = Integer.parseInt(time.substring(0,2));
    int minute = Integer.parseInt(time.substring(2));
    return hour * 60 + minute;
}
}