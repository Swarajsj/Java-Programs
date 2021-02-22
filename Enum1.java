enum EmployeeCategory {
    ADHOC, PERMANENT, TEMPORARY;
}

class Enum1 {
    public static void main(String[] args) {
        for (EmployeeCategory e : EmployeeCategory.values()) // for each statement
        {
            System.out.println(e);
        }
    }

}
