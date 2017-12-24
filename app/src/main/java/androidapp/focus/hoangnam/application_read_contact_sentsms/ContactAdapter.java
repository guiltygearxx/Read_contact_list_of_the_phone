package androidapp.focus.hoangnam.application_read_contact_sentsms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HoangNam on 12/23/2017.
 */

public class ContactAdapter extends ArrayAdapter<DetailsContact> {
    private Context mContext;

    private int[] arrayColor = {
            R.color.red, R.color.pink, R.color.purple, R.color.black, R.color.blue, R.color.green,
            R.color.yellow, R.color.orange, R.color.brown, R.color.grey, R.color.white};

    List<DetailsContact> detailsContacts;

    public ContactAdapter(Context c,  int textViewResourceId,ArrayList<DetailsContact> detailsContacts) {
        super(c, textViewResourceId, detailsContacts);

        mContext = c;
        this.detailsContacts = detailsContacts;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View view;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        DetailsContact detailsContact = getItem(position);
        if (convertView == null) {

            view = new View(mContext);
            view = inflater.inflate(R.layout.item_list_contact, null);
            TextView txt_name_contact = (TextView) view.findViewById(R.id.txt_contact);
            TextView txt_namespace = (TextView) view.findViewById(R.id.txt_view_namspace);
            TextView txt_phoneNumber = (TextView) view.findViewById(R.id.txt_phoneNumber);
            RelativeLayout img_layout = (RelativeLayout) view.findViewById(R.id.layout_contact_color);

            if(detailsContact.getNameContact() != null){
                txt_name_contact.setText(detailsContact.getNameContact());
                txt_phoneNumber.setText(detailsContact.getPhoneContact());
                txt_namespace.setText(detailsContact.getNameContact().substring(0, 1).toString());
            }


        } else {
            view = (View) convertView;
        }

        return view;
    }
}
