package sample;

public class ArraySample {

    public static void main(String[] args) {
        var numbers = new int[5]; //配列は参照型のためnewキーワードで初期化
        
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; //配列の各要素に値を代入          
        }
        
        //配列の要素を表示
        for (var i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
                  
        }
    }

}

//配列は参照型なので、newキーワードで初期化
//forループを使用し、配列numbersの各要素に値を代入
//numbers.lengthは配列の長さを示す、今回は５
//forループのインデックスiは０から始まり、４まで増加
//numbers[i]で「インデックスiの位置の配列の要素」を指し示す。
//i*2を計算し、インデックスiの位置の「配列の要素」に代入