/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Khumo
 */
public class Tasks {

    private final int CURRENT = 29;
    private String taskName;
    private String taskPriority;
    private String taskStatus;
    private int daysRemaining;
  

    public Tasks() {
    }

    public Tasks( String taskName, String taskPriority, int daysRemaining,String taskStatus ) {
        
        this.taskName = taskName;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
        this.daysRemaining = daysRemaining;
    }

   
   

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(int daysRemaining) {
        this.daysRemaining = daysRemaining;
    }

    public boolean isValid() {
        boolean v = false;

        if (daysRemaining < CURRENT) {
            v = true;
        }
        return v;
    }

}
