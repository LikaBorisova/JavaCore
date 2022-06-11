package Lesson3;

public class ArrReplaceClass <tmp>{
    tmp replacement;

    public tmp[] ArrReplacePos(tmp[] arr, int i, int j){
        replacement = arr[i];
        arr[i] = arr[j];
        arr[j] = replacement;
        return arr;
    }
}
