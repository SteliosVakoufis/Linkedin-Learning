public class FortuneTeller{
    public static void main(String[] args) {
        int fortune = (int)(Math.random() * 10);
        System.out.println(fortune);

        if (fortune > 5){
            System.out.println("You have good fortune");
        }else{
            System.out.println("You have bad fortune");
        }

    }
}