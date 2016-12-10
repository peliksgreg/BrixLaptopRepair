package apc.entjava.photogallery.model;

import javax.persistence.*;

/**
 * Created by jacobcat on 12/2/2016.
 */
@Entity
public class Image {

    private int imageId;
    private String name;
    private UserImageFile image;
    private Category category;
    private User uploadedBy;

    @Id
    @GeneratedValue
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Column(nullable=false, length=50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserImageFile getImage() {
        return image;
    }

    public void setImage(UserImageFile image) {
        this.image = image;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    public User getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }
}
