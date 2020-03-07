package service.exception;

/**
 * @program: homeplus
 * @description:
 * @author: wuyuxi
 * @create: 2019-12-30 13:25
 **/
public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
