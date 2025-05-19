import java.util.Scanner;

public class P_QUIZ_GAME {
    public static void main(String[] args) {

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO QUIZ GAME.!!------DON'T WORRY YOU ARE GENIUS.");
        int score = 0;

        System.out.print("QUESTION : ");
//------------------------------------------------------------------------------------------------------------
        System.out.println("""
                 1. What is the capital of India?
                A. Mumbai
                B. New Delhi
                C. Hyderabad
                D. Kolkata""");
        System.out.print("ENTER YOUR ANSWER HERE : ");
        char Q_1 = sc.next().charAt(0);

        Q_1 = Character.toUpperCase(Q_1);
        if(Q_1=='B'){
            System.out.println("YOUR ANSWER IS CORRECT!!");
            score++;
        }
        else {
            System.out.println("SORRY YOUR ANSWER IS INCORRECT. RIGHT ANSWER IS B.");
        }

//------------------------------------------------------------------------------------------------------------

        System.out.println("""
                2. Which planet is known as the Red Planet?
                A. Venus
                B. Earth
                C. Mars
                D. Jupiter""");
        System.out.print("ENTER YOUR ANSWER HERE : ");
        char Q_2 = sc.next().charAt(0);

        Q_2 = Character.toUpperCase(Q_2);
        if(Q_2 =='C'){
            System.out.println("YOUR ANSWER IS CORRECT!!");
            score++;
        }
        else {
            System.out.println("SORRY YOUR ANSWER IS INCORRECT. RIGHT ANSWER IS C.");
        }

//------------------------------------------------------------------------------------------------------------

        System.out.println("""
                 3. Who invented the Light Bulb?
                A. Nikola Tesla
                B. Thomas Edison
                C. Isaac Newton
                D. Albert Einstein""");
        char Q_3 = sc.next().charAt(0);

        Q_3 = Character.toUpperCase(Q_3);
        if(Q_3 =='B'){
            System.out.println("YOUR ANSWER IS CORRECT!!");
            score++;
        }
        else {
            System.out.println("SORRY YOUR ANSWER IS INCORRECT. RIGHT ANSWER IS B.");
        }



//------------------------------------------------------------------------------------------------------------

        System.out.println("""
                 4. Which is the smallest prime number?
                A. 1
                B. 0
                C. 2
                D. 3""");
        char Q_4 = sc.next().charAt(0);

        Q_4 = Character.toUpperCase(Q_4);
        if(Q_4 =='C'){
            System.out.println("YOUR ANSWER IS CORRECT!!");
            score++;
        }
        else {
            System.out.println("SORRY YOUR ANSWER IS INCORRECT. RIGHT ANSWER IS C.");
        }



//------------------------------------------------------------------------------------------------------------

        System.out.println("""
                 5. What does CPU stand for?
                A. Central Power Unit
                B. Computer Processing Unit
                C. Central Processing Unit
                D. Control Program Utility""");
        char Q_5 = sc.next().charAt(0);

        Q_5 = Character.toUpperCase(Q_5);
        if(Q_5 =='C'){
            System.out.println("YOUR ANSWER IS CORRECT!!");
            score++;
        }
        else {
            System.out.println("SORRY YOUR ANSWER IS INCORRECT. RIGHT ANSWER IS C.");
        }

//------------------------------------------------------------------------------------------------------------

        System.out.println("YOUR FINAL SCORE IS : "+ score);

        if(score<=3){
            System.out.println("YOU ARE AVERAGE ON QUIZ...");
        }
        else {
            System.out.println("YOU ARE GENIUS ON QUIZ...");
        }
*/



//-------------CHATGPT CODE!-----------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);

                String[] questions = {
                        """
                1. What is the capital of India?
                A. Mumbai
                B. New Delhi
                C. Hyderabad
                D. Kolkata""",
                        """
                2. Which planet is known as the Red Planet?
                A. Venus
                B. Earth
                C. Mars
                D. Jupiter""",
                        """
                3. Who invented the Light Bulb?
                A. Nikola Tesla
                B. Thomas Edison
                C. Isaac Newton
                D. Albert Einstein""",
                        """
                4. Which is the smallest prime number?
                A. 1
                B. 0
                C. 2
                D. 3""",
                        """
                5. What does CPU stand for?
                A. Central Power Unit
                B. Computer Processing Unit
                C. Central Processing Unit
                D. Control Program Utility"""
                };

                char[] answers = {'B', 'C', 'B', 'C', 'C'};

                int score = 0;

                System.out.println("🎮 WELCOME TO THE QUIZ GAME 🎮");

                for (int i = 0; i < questions.length; i++) {
                    System.out.println(questions[i]);
                    System.out.print("ENTER YOUR ANSWER HERE: ");
                    char userAnswer = sc.next().charAt(0);
                    userAnswer = Character.toUpperCase(userAnswer);

                    if (userAnswer == answers[i]) {
                        System.out.println("✅ CORRECT!");
                        score++;
                    } else {
                        System.out.println("❌ WRONG! Correct answer is: " + answers[i]);
                    }

                    System.out.println("------------------------------");
                }

                System.out.println("🎯 YOUR FINAL SCORE: " + score + "/" + questions.length);

                if (score <= 3) {
                    System.out.println("😅 YOU ARE AVERAGE ON QUIZ...");
                } else {
                    System.out.println("💥 YOU ARE GENIUS ON QUIZ...");
                }

                sc.close();





    }
}
