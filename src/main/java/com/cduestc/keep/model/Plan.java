package com.cduestc.keep.model;

public class Plan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keep_plan.plan_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Long planId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keep_plan.owner_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Long ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keep_plan.sports
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private String sports;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keep_plan.state
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keep_plan.plan_ID
     *
     * @return the value of keep_plan.plan_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keep_plan.plan_ID
     *
     * @param planId the value for keep_plan.plan_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keep_plan.owner_ID
     *
     * @return the value of keep_plan.owner_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keep_plan.owner_ID
     *
     * @param ownerId the value for keep_plan.owner_ID
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keep_plan.sports
     *
     * @return the value of keep_plan.sports
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getSports() {
        return sports;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keep_plan.sports
     *
     * @param sports the value for keep_plan.sports
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setSports(String sports) {
        this.sports = sports == null ? null : sports.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keep_plan.state
     *
     * @return the value of keep_plan.state
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keep_plan.state
     *
     * @param state the value for keep_plan.state
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setState(Integer state) {
        this.state = state;
    }
}