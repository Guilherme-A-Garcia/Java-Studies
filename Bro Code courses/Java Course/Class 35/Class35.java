// 2D Arrays - Managing matrices of data

public class Class35{
    public static void main(String[] args){
        // 2D arrays are arrays where each element IS an array.
        // It's useful for storing a matrix (grid) of data.


        // These below are simple one-dimensional arrays:
        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork", "beef", "fish"};
        // (This is way better for readability when referencing, but you can insert the array
        //  directly inside the 2D array declaration)


        // And this is a 2D array:
        String[][] groceries = {{"apple", "orange", "banana"}, 
                                {"potato", "onion", "carrot"}, 
                                {"chicken", "pork", "beef", "fish"}};

        // To deal with a value, you must indicate its row and column:
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][1] = "eggs";

        // for(String[] foods : groceries){
        //     // System.out.println(foods); You could do this, but you'd end up with memory addresses.
        //     for(String food : foods){
        //         System.out.print(food + " ");
        //     }
        //     System.out.println();
        // }

        char[][] telephone = {{'1', '2', '3'}, 
                              {'4', '5', '6'}, 
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}