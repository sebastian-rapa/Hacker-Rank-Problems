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
}
