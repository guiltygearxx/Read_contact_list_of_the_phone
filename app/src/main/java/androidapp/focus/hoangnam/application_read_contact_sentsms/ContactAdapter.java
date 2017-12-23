package androidapp.focus.hoangnam.application_read_contact_sentsms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by HoangNam on 12/23/2017.
 */

public class ContactAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] txt_contact;
    private final int[] img_color_contact;

    public ContactAdapter(Context c,String[] txt_contact,int[] img_color_contact ) {
        mContext = c;
        this.img_color_contact = img_color_contact;
        this.txt_contact = txt_contact;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return txt_contact.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View listView;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            listView = new View(mContext);
            listView = inflater.inflate(R.layout.item_list_contact, null);
            TextView txt_name_contact = (TextView) listView.findViewById(R.id.txt_contact);
            TextView txt_namespace = (TextView) listView.findViewById(R.id.txt_view_namspace);
            RelativeLayout img_layout = (RelativeLayout) listView.findViewById(R.id.layout_contact_color);
            txt_name_contact.setText(txt_contact[position]);
            txt_namespace.setText(txt_contact[position].substring(0,1));
            img_layout.setBackgroundColor(img_color_contact[position]);
        } else {
            listView = (View) convertView;
        }

        return listView;
    }
}
