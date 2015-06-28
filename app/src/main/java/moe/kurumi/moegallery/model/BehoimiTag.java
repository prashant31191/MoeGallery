package moe.kurumi.moegallery.model;

import com.google.gson.annotations.Expose;

/**
 * Created by kurumi on 15-6-1.
 */
public class BehoimiTag implements Tag {

    @Expose
    private Long type;
    @Expose
    private Long count;
    @Expose
    private String name;
    @Expose
    private Long id;
    @Expose
    private Boolean ambiguous;

    /**
     *
     * @return
     * The type
     */
    public Long getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The count
     */
    public Long getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The ambiguous
     */
    public Boolean getAmbiguous() {
        return ambiguous;
    }

    /**
     *
     * @param ambiguous
     * The ambiguous
     */
    public void setAmbiguous(Boolean ambiguous) {
        this.ambiguous = ambiguous;
    }

    /**
     * @return The name
     */
    public String toString() {
        return getName().replace('_', ' ') + " (" + getCount() + ")";
    }
}