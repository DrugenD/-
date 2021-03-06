package com.cduestc.keep.model;

public class SubstituteFood {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.food_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Long foodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.food_name
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private String foodName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.image_url
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private String imageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.calorie
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Integer calorie;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.brand
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.price
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column substitute_food.description
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.food_ID
     *
     * @return the value of substitute_food.food_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Long getFoodId() {
        return foodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.food_ID
     *
     * @param foodId the value for substitute_food.food_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.food_name
     *
     * @return the value of substitute_food.food_name
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.food_name
     *
     * @param foodName the value for substitute_food.food_name
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.image_url
     *
     * @return the value of substitute_food.image_url
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.image_url
     *
     * @param imageUrl the value for substitute_food.image_url
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.calorie
     *
     * @return the value of substitute_food.calorie
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Integer getCalorie() {
        return calorie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.calorie
     *
     * @param calorie the value for substitute_food.calorie
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.brand
     *
     * @return the value of substitute_food.brand
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.brand
     *
     * @param brand the value for substitute_food.brand
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.price
     *
     * @return the value of substitute_food.price
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.price
     *
     * @param price the value for substitute_food.price
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column substitute_food.description
     *
     * @return the value of substitute_food.description
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column substitute_food.description
     *
     * @param description the value for substitute_food.description
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}