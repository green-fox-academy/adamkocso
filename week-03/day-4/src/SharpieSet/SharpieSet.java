package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> pencilCase;


    public SharpieSet () {
        this.pencilCase = new ArrayList<>();
    }


    public void add(Sharpie sharpie) {
        pencilCase.add(sharpie);
    }



    public int usableSharpie() {
        int usableCount = 0;
        for (int i = 0; i < pencilCase.size(); i++) {
            if (pencilCase.get(i).inkAmount > 0) {
                usableCount++;
            }
        }
        return usableCount;

    }

    public int removeTrash() {
            List <Sharpie> temp = new ArrayList<>();

            for (int i = 0; i < pencilCase.size(); i++) {
                if (pencilCase.get(i).inkAmount <= 0) {
                    temp.add(pencilCase.get(i));
                }
            }
            pencilCase.removeAll(temp);
        return pencilCase.size();
    }

}
