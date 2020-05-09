package main.code.algorithms;

class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int fistCatToTheMouse = Math.abs(x-z);
        int secondCatToTheMouse = Math.abs(y-z);

        if (fistCatToTheMouse == secondCatToTheMouse)
            return "Mouse C";
        else if (fistCatToTheMouse > secondCatToTheMouse)
            return "Cat B";
        else
            return "Cat A";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
}
