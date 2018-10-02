package W2;

import java.util.Scanner;

class problem_2{
    private int width;

    private final String SIGN = "[*]";

    problem_2(int width){
        this.width = width;
    }

    public String toString(){
        String res = "";

        for (int i = 0; i < width; ++i){
            for (int j = 0; j <= i; ++j){
                res += this.SIGN;
            }

            res += "\n";
        }

        return res;
    }
}

