package diceGame;

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int round = 0;
    
    int player1[] = new int[5];

    int player2[] = new int[5];

    String confirm = scanner.nextline();

    confirm.toLowerCase();

    while(confirmation == "y" || "yes" || "mmhm" || "sure"){

        for(int i = 0; player1.lenght;i++){
            int a =  (int) ((Math.random() *6) +1);
            player1.add(a);
            int b =  (int) ((Math.random() *6) +1);
            player2.add(b);
        }
        
        System.out.println("Player 1 rolled" + player1 + " \n Player 2 rolled" + player2);

        round++;
    
        String confirmation = scanner.nextline();

        String confirmation = confirmation.toLowerCase();
        }
    }}

