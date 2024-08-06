package org.example.entity;

import com.sun.source.util.TaskListener;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                return unassignedTasks;
        }
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task> set, Set<Task> set2){
        set.addAll(set2);
        return set;
    }
    public Set<Task> getIntersection(Set<Task> set, Set<Task> set2){
      set.retainAll(set2);
      return set;
    }

    public Set<Task> getDifferences(Set<Task> set, Set<Task> set2){
        set.removeAll(set2);
        return set;
    }
}
