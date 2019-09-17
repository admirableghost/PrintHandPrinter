package cordova-plugin-printhand-printer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class PrintHandPrinterPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        } else if (action.equals("print")) {
            String content = args.getString(0);
            this.print(content, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void print(String content, CallbackContext callbackContext) {
        if (content != null && content.length() > 0) {
            try {

            } catch (Exception ex) {
                callbackContext.error("Something went wrong " + ex);
            }
            callbackContext.success(content);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
