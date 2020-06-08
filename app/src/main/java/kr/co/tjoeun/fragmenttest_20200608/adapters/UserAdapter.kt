package kr.co.tjoeun.fragmenttest_20200608.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.fragmenttest_20200608.R
import kr.co.tjoeun.fragmenttest_20200608.datas.User

class UserAdapter(
    val mContext:Context,
    val resId:Int,
    val mList:List<User>) : ArrayAdapter<User>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {
//            null이 아닐땐 그냥 지나간다 => 재활용 할 뷰가 있으니까. 새로 그리지 않는다.
        }.let {
//            tempRow가 null인 경우. => 재활용 할 뷰 X, 새로 그려야한다.

            tempRow = inf.inflate(R.layout.user_list_item, null)
        }

//        null일 가능성이 없어진 tempRow를 !!를 붙여서 row에 대입.
        val row = tempRow!!


        return row
    }

}