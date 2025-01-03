package tubespbo;

public class User {
    private String name;
    private int age;
    private String gender;
    private int height;
    private int weight;

    // Constructor with validation
    public User(String name, int age, String gender, int height, int weight) throws ValidationInputException {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationInputException("Nama tidak boleh kosong.");
        }
        if (age <= 0) {
            throw new ValidationInputException("Usia harus lebih besar dari 0.");
        }
        if (gender == null || gender.equalsIgnoreCase("Jenis Kelamin") || gender.trim().isEmpty()) {
            throw new ValidationInputException("Jenis kelamin harus dipilih.");
        }
        if (height <= 0) {
            throw new ValidationInputException("Tinggi badan harus lebih besar dari 0.");
        }
        if (weight <= 0) {
            throw new ValidationInputException("Berat badan harus lebih besar dari 0.");
        }

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // Method to calculate ideal weight
    public double calculateIdealWeight() {
        if (gender.equalsIgnoreCase("Perempuan")) {
            return height - 100 - (0.15 * (height - 100));
        } else {
            return height - 100 - (0.1 * (height - 100));
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
