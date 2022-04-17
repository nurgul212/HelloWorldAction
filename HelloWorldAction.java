package com.nurgulamat;
package io.jenkins.plugins.sample;
import hudson.model.Action;
import hudson.model.run;
import hudson.model.RunAction2;

//Since we want to store the name used in the greeting, we will
//    need to add a filed with getter to this class. We will also
//   add a constructor that tasks the name as argument

//RunAction2 is the interface to implement so that actions added to Run properly get references to the Run

public class HelloWorldAction implements RunAction2 {

    private String name;
    private transient Run run;

    public helloWorldAction(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @Override
    public String getDisplayName(){
        return "Greeting";
    }

    @Override
    public String getUrlName() {
        return "greeting";
    }

//    The Run is stored in a transient action so this filed won't be
//    serialized to disk with the action

    @Override
    public void onAttached(Run<?,?>run){

    }
    @Override
    public vooid onLoad(Run<?,?>run){
        this.run = run;
    }
    public Run getRun(){
        return run;
    }
}
