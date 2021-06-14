package com.zekab.mdccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.card.MaterialCardView

class DraggableCardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draggable_card_view)

        val parentContainer:DraggableCoordinatorLayout = findViewById(R.id.parentCoordinatorLayout)
        val draggableCard1:MaterialCardView = findViewById(R.id.draggableCard1)
        val draggableCard2:MaterialCardView = findViewById(R.id.draggableCard2)
        val draggableCard3:MaterialCardView = findViewById(R.id.draggableCard3)
        val draggableCard4:MaterialCardView = findViewById(R.id.draggableCard4)

        parentContainer.addDraggableChild(draggableCard1)
        parentContainer.addDraggableChild(draggableCard2)
        parentContainer.addDraggableChild(draggableCard3)
        parentContainer.addDraggableChild(draggableCard4)

        parentContainer.setViewDragListener(object : DraggableCoordinatorLayout.ViewDragListener {
            override fun onViewCaptured(view: View, i: Int) {

                when (view.id) {
                    R.id.draggableCard1 -> draggableCard1.isDragged = true
                    R.id.draggableCard2 -> draggableCard2.isDragged = true
                    R.id.draggableCard3 -> draggableCard3.isDragged = true
                    R.id.draggableCard4 -> draggableCard4.isDragged = true
                }
            }

            override fun onViewReleased(view: View, v: Float, v1: Float) {

                when (view.id) {
                    R.id.draggableCard1 -> draggableCard1.isDragged = false
                    R.id.draggableCard2 -> draggableCard2.isDragged = false
                    R.id.draggableCard3 -> draggableCard3.isDragged = false
                    R.id.draggableCard4 -> draggableCard4.isDragged = false
                }
            }
        })

    }
}