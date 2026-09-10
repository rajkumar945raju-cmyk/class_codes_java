class UnderAge extends Exception{
    UnderAge(String message){
        super(message);
    }
}


class AgeVote{
    int age;

    AgeVote(int age){
        this.age = age;
    }

    public void display() throws UnderAge{
    if(age<18){
        throw new UnderAge("Not Eligiable!");
    }else{
        System.out.println("Eligiable!");
    }
}
}


public class MainVote{
    public static void main(String[] args) {
        AgeVote AV = new AgeVote(11);

        try{
            AV.display();
        }catch(UnderAge e){
            System.out.println(e);
        }
    }
}
