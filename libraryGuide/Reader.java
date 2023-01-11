package libraryGuide;

public class Reader {

    private String name;
    private int number;
    private String date;
    private String phone;
    private String facult;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getFacult() {
        return facult;
    }

    public void takeBook(String book) {
        System.out.println();
        System.out.println("Студент " + name + " взял книгу:  " + book);
    }

    public void returnBook(String book) {
        System.out.println();
        System.out.println("Студент " + name + " вернул книгу:  " + book);
    }

    public void info() {
        System.out.println();
        System.out.println(name + " " + number + " " + facult + " " + phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (number != reader.number) return false;
        if (name != null ? !name.equals(reader.name) : reader.name != null) return false;
        if (date != null ? !date.equals(reader.date) : reader.date != null) return false;
        if (phone != null ? !phone.equals(reader.phone) : reader.phone != null) return false;
        return facult != null ? facult.equals(reader.facult) : reader.facult == null;
    }

}
