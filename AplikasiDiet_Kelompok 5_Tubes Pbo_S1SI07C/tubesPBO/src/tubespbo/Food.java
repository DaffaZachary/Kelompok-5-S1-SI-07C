package tubespbo;

public class Food {
    private String id;
    private String food;
    private int calories;

    public Food(String id, String food, int calories) throws ValidationInputException {
        if (id == null || id.trim().isEmpty()) {
            throw new ValidationInputException("ID makanan tidak boleh kosong.");
        }
        if (food == null || food.trim().isEmpty()) {
            throw new ValidationInputException("Nama makanan tidak boleh kosong.");
        }
        if (calories <= 0) {
            throw new ValidationInputException("Kalori harus bernilai positif.");
        }

        this.id = id;
        this.food = food;
        this.calories = calories;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return food;
    }

    public int getCalories() {
        return calories;
    }
}
