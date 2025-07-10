class Solution {
        private static final List<String> MONTHS = List.of("", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

public String reformatDate(String date) {
	var parts = date.split(" ");
	return new StringBuilder(parts[2])
					 .append("-")
					 .append(String.format("%02d", MONTHS.indexOf(parts[1])))
					 .append("-")
					 .append(String.format("%02d", Integer.parseInt(parts[0].substring(0, parts[0].length() - 2))))
					 .toString();
    }
}