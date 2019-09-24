package cordova-plugin-calculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class calculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }

        if (action.equals("add")) {
            
            this.add(args, callbackContext);
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

    private void add(JSONArray arr, callbackContext callback){
            if (arg == null)
            {
                callback.error("Please do not pass null values")
            }
            else
            {

                try{

                    int va11 =Integer.parseInt(arr.getJsonObject().getString("param1"));
                    int va12 =Integer.parseInt(arr.getJsonObject().getString("param2"));
                    callback.success((va11+va12).toString())
                }
                catch(Exception ex){
                callback.error("OOpsa There is an Error :" + ex.toString());

                }
            }
    }
}
