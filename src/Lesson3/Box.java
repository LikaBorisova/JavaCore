package Lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruitList;

    public Box( ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public Double getWeightList(){
        double result = 0;
        for(T t: getfruitList()){
            if(t!=null) {
                double value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }


    public Boolean compareList(Box<?> fruitbox){
        if(this.getWeightList().doubleValue() == fruitbox.getWeightList().doubleValue()) return true;
        return false;
    }

    private Integer getBoxSize(){
        int result = 0;
        for(T t: getfruitList()){
            if(t!=null) result++;
        }
        return result;
    }

    public void toShiftList(Box<T> fruitbox){
        System.out.println("В изначальной коробке было: " + this.getBoxSize() + " фруктов, весом: " + this.getWeightList());
        System.out.println("В текущем коробке было: " + fruitbox.getBoxSize() + " фруктов, весом: " + fruitbox.getWeightList());
        for(T t: fruitbox.getfruitList()){
            this.getfruitList().add(t);
        }
        fruitbox.getfruitList().clear();

        System.out.println("В изначальной коробке стало: " + this.getBoxSize() + " фруктов, весом: " + this.getWeightList());
        System.out.println("В текущем коробке стало: " + fruitbox.getBoxSize() + " фруктов, весом: " + fruitbox.getWeightList());
        System.out.println();
    }


    public ArrayList<T> getfruitList() {
        return fruitList;
    }

}
