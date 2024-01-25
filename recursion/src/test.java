public class test {
    public static void main(String[] args){

        nStarTriangle(3);

    }


        public static void nStarTriangle(int n) {
            // Iterate over each row
            for (int i = 0; i < n; i++) {
                // Print spaces
                for (int j = 0; j < n + i; j++) {
                    if (j < n - i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                // Move to the next line after each row
                System.out.println();
            }
        }


    }


