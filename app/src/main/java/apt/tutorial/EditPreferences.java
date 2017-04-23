package apt.tutorial;

import android.os.Bundle;
import  android.preference.PreferenceActivity;

/**
 * Created by IS on 23/04/2017.
 */

public class EditPreferences extends PreferenceActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
