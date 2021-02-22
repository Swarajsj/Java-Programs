enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class Enum2 {
    public static void main(String[] args) {
        for (DayOfWeek e : DayOfWeek.values()) // for each
        {
            switch (e) // switch case
            {
                case MONDAY:
                    System.out.println("Mondays are hectic!");
                    break;
                case TUESDAY:
                    System.out.println("Tuesdays are hectic too!");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesdays are cooool!");
                    break;
                case THURSDAY:
                    System.out.println("Thursdays have hope for weekend!");
                    break;
                case FRIDAY:
                    System.out.println("Week about to end!");
                    break;
                case SATURDAY:
                    System.out.println("Weekend!");
                    break;

            }
        }
    }
}
