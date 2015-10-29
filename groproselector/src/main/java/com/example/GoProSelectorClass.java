package com.example;


import java.util.Scanner;

public class GoProSelectorClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GoProSelectorClass select = new GoProSelectorClass();
        String answer;
        int input;
        do
        {
            System.out.print("Do you want to choose based off of resolution(1) or price(2)?: ");
            input = scan.nextInt();
        }while(input < 1 || input > 2 );
        if(input == 1)
        {
            answer = select.resolution();
            System.out.println("You should get the " + answer);
        }
        else
        {
            answer = select.Pricepoint();
            System.out.println("You should get the " + answer);
        }


    }

    public String resolution()
    {
        Scanner scan = new Scanner(System.in);
        int input;
        String answer;
        do {
            System.out.println("What resolution and frame rate do you want to record at? \n1. 4k\n2. 1080p60fps and 720p120fps\n3. 1080p60fps and 720p60fps\n4. 1080p60\n5. 1080p60fps and 720p60fps");
            input = scan.nextInt();
        }while(input > 6 || input < 1);

        switch(input)
        {
            case 1: answer = "Hero 4 Black"; break;
            case 2: answer = "Hero 4 Silver"; break;
            case 3: answer = "Hero + LCD"; break;
            case 4: answer = "Hero 4 Hero+"; break;
            case 5: answer = "Hero 4 Hero"; break;
            default: answer = "How did you break my while loop?";
        }
        return answer;
    }

    public String Pricepoint()
    {
        Scanner scan = new Scanner(System.in);
        int input;
        String answer;
        do {
            System.out.println("What price point are you comfortable with? \n1. $499.99\n2. $399.99\n3. $299.99\n4. $199.99\n5. $129.99");
            input = scan.nextInt();
        }while(input > 6 || input < 1);

        switch(input)
        {
            case 1: answer = "Hero 4 Black"; break;
            case 2: answer = "Hero 4 Silver"; break;
            case 3: answer = "Hero + LCD"; break;
            case 4: answer = "Hero 4 Hero+"; break;
            case 5: answer = "Hero 4 Hero"; break;
            default: answer = "How did you break my while loop?";
        }
        return answer;
    }
}
