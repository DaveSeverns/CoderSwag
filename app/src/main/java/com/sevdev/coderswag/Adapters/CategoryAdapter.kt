package com.sevdev.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.sevdev.coderswag.Model.Category
import com.sevdev.coderswag.R

/**
 * Created by davidseverns on 3/7/18.
 */
class CategoryAdapter(context: Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories =  categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder

        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder = ViewHolder()
            holder.catImg  = categoryView.findViewById(R.id.categoryImage)
            holder.catTxt = categoryView.findViewById(R.id.categoryName)
            println("Exist for the first time")
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Recycle")
        }

        val category = categories[position]
        holder.catTxt?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image, "drawable",context.packageName)
        holder.catImg?.setImageResource(resourceId)


        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    private class ViewHolder{
        var catImg : ImageView? = null
        var catTxt : TextView? = null
    }
}