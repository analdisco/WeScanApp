package viewModelFactories.views

import models.json.StatsModel
import viewModelFactories.BaseVMF
import viewModels.views.BottomBarVM

class BottomBarVMF : BaseVMF<BottomBarVM>() {
    override fun mock(): BottomBarVM {
        return BottomBarVM(200, 30, 230)
    }

    fun create(statsModel : StatsModel): BottomBarVM {
        return BottomBarVM(statsModel.total, statsModel.checked_in, statsModel.checked_out)
    }
}