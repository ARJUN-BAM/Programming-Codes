class Ex {
    public static void main(String[] args) {
        int size = 5, space = size / 2, star = 1;
        
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < space; j++)
                System.out.print("  ");
            
            for (int j = 0; j < star; j++) {
                if (j == 0 || j == star - 1) 
                    System.out.print("* ");
                else if (i != 0 && i != size)
                    System.out.print("  ");
            }
            
            if (i < size / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            
            System.out.println();
        }
    }
}
