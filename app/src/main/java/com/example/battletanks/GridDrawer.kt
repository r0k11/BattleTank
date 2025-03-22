package com.example.battletanks

import android.content.Context
import android.view.View
import android.graphics.Color
import android.widget.FrameLayout

class GridDrawer(private val context: Context) {
    fun drawGrid(){
        val container = binding.conteiner
        drawHorizontalLines(container)
        drawVerticalLines(container)
    }

    private fun drawHorizontalLines(container: FrameLayout) {
var topMargin = 0
        while(topMargin<=container!!.height){
            val horizontalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, height 1)
            topMargin += 50
            layoutParams.topMargin = topMargin
            horizontalLine.layoutParams= layoutParams
            horizontalLine.setBackgroundColor(Color.WHITE)
            container.addView(horizontalLine)
        }
    }
    private fun drawVerticalLines(container: FrameLayout) {
var leftMarqin = 0
        while (leftMarqin<=container!!.width){
            val verticalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(widght 1,FrameLayout.LayoutParams.MATCH_PARENT)
            leftMarqin += 50
            layoutParams.leftMargin = leftMarqin
            verticalLine.layoutParams = layoutParams
            verticalLine.setBackgroundColor(Color.WHITE)
            container.addView(verticalLine)
        }
    }

}