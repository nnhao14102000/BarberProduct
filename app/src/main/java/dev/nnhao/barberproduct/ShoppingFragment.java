package dev.nnhao.barberproduct;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {
    private RecyclerView productsRecView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        productsRecView = getView().findViewById(R.id.productsRecView);
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

        ProductsRecViewAdapter adapter = new ProductsRecViewAdapter(ShoppingFragment.this);
        adapter.setProducts(products);

        productsRecView.setAdapter(adapter);
        productsRecView.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}