public class Player {

    private String name;
    private String email;

    private boolean white;

    private int rank;
    private int age;
    public Player(String name, String email, boolean white, int rank, int age){
        if (name == null || name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("the name should not empty");
        }else {
            this.name = name;
        }
//        if (email == null || email.isEmpty() || email.isBlank()){
//            throw new IllegalArgumentException("the email should not empty");
//        }
//        if (email.contains("@") || email.contains(".")){
//            throw new IllegalArgumentException("the email should contain '@' and '.'");
//
//        }
//        else {
//        }
        this.email = email;
        this.white = white;
        this.rank = rank;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    public boolean isWhite() {
        return white;
    }
    public int getRank(){
        return rank;
    }

    public int getAge(){
        return age;
    }

    public void setRank(int rank){
        if(rank<100 || rank>3000){
            throw new IllegalArgumentException("The rank should be in range of 100 and 3000 ");
        }

        this.rank = rank;
        System.out.println("the rank of" + name + " was changed to " + rank);
    }

    public void setAge(int age){
        if(age<0 || age>100){
            throw new IllegalArgumentException("The age should be in range of 0 and 100 ");
        }

        this.age = age;
        System.out.println("the age of" + age + " was changed to " + age);
    }
    public void movePiece(Piece piece, Spot spot){
        if (isWhite() != piece.isWhite()){
            throw new IllegalArgumentException("Incorrect piece color. Try again");
        }
        piece.setSpot(spot);
        System.out.println("Piece" + piece.getName() + "is moved to: " + spot);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
