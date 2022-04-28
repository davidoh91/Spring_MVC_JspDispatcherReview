package controller;
/*
현재 요청이 어떤 controller 를 실행해야 하는지를 알아서 찾아 리턴해주는 클래스
요청 param (?key=asdf) 을 받아 필요한 컨트롤러 클래스 를 리턴해준다
 */
public class HandlerMapping {
    //use singleton to provide HandlerMapping instance to DispatcherServlet
    private static HandlerMapping factory = new HandlerMapping();

    private HandlerMapping() {}

    public static HandlerMapping getFactory() {
        return factory;
    }

    public Controller getController(String key) {
        Controller controller = null;

        if(key.equals("insert")) {
            controller = new InsertController();
        }else if(key.equals("select")) {
            controller = new SelectController();
        }else if(key.equals("update")) {
            controller = new UpdateController();
        }else if(key.equals("delete")) {
            controller = new DeleteController();
        }

        return controller;
    }
}
