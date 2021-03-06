package com.epam.ae.action;

public class ActionResult {
    public String path; //url
    public boolean redirect; //get or post

    public ActionResult(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    public ActionResult(String login) {
        this(login, false);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isRedirect() {
        return redirect;
    }

    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }
}
