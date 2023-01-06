public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int pointsMargin = gryffindor-ravenclaw;
        
        if (pointsMargin >= 300) {
            System.out.println("Gryffindor are the champions");
        } else if (pointsMargin >= 0) {
            System.out.println("Gryffindor is in second place");
        } else if (pointsMargin >= -100) {
            System.out.println("Gryffindor is in third place");
        } else {
            System.out.println("Gryffindor is in fourth place");
        }
        
    }
}
