package apc.entjava.photogallery.model;

import javax.persistence.*;

/**
 * Created by jacobcat on 12/2/2016.
 */
@Entity
public class Category {

    private int categoryId;
    private String categoryName;
    private CategoryImageFile image;

    @Id
    @GeneratedValue
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(nullable=false, length=50)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryImageFile getImage() {
        return image;
    }

    public void setImage(CategoryImageFile image) {
        this.image = image;
    }
}
