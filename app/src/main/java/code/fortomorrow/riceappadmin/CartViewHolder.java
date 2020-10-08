package code.fortomorrow.riceappadmin;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import code.fortomorrow.riceappadmin.Interface.ItemClickListner;


public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductPrice,txtProductQuantity,txtProductDescription;
    private ItemClickListner itemClickListner;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);
        txtProductName = itemView.findViewById(R.id.cart_product_name);
        txtProductPrice =itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
        txtProductDescription = itemView.findViewById(R.id.cart_product_address);
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v, getAdapterPosition(),false);
    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;

    }
}
