package dev.nnhao.barberproduct;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoppingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingFragment extends Fragment {
    private RecyclerView productsRecView;
    private Context context;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoppingFragment() {
        // Required empty public constructor
    }
    public ShoppingFragment(Context context) {
        // Required empty public constructor
        this.context = context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoppingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoppingFragment newInstance(String param1, String param2) {
        ShoppingFragment fragment = new ShoppingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);

        productsRecView = view.findViewById(R.id.productsRecView);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Wax", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax1", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax2", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax3", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax4", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax5", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax6", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax7", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax8", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax9", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax10", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        products.add(new Product("Wax11", "10", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));

        ProductsRecViewAdapter adapter = new ProductsRecViewAdapter(getContext());
        adapter.setProducts(products);

        productsRecView.setAdapter(adapter);
        productsRecView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        return view;
    }
}