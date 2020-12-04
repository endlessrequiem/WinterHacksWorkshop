package csclub.winterhacksworkshop.ui.secondfrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import csclub.winterhacksworkshop.R

class SecondFragment : Fragment() {
    private var secondFragmentViewModel: SecondFragmentViewModel? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        secondFragmentViewModel = ViewModelProvider(this).get(SecondFragmentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_second, container, false)

        return root
    }
}