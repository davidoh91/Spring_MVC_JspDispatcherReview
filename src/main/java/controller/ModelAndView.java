package controller;

public class ModelAndView {
    private String viewName;
    private boolean isRedirect; //true = redirect 방식, false = forward 방식


    public ModelAndView() {}
    public ModelAndView(String viewName, boolean isRedirect) {
        this.viewName = viewName;
        this.isRedirect = isRedirect;
    }


    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public boolean isRedirect() {
        return isRedirect;
    }

    public void setRedirect(boolean redirect) {
        isRedirect = redirect;
    }
}
