package wetickets.wescanapp.domain.viewModelFactories.views

import wetickets.wescanapp.domain.models.json.StatsModel
import wetickets.wescanapp.domain.viewModelFactories.BaseVMF
import wetickets.wescanapp.domain.viewModels.views.BottomBarVM

class BottomBarVMF : BaseVMF<BottomBarVM>() {
    override fun mock(): BottomBarVM {
        return BottomBarVM(200, 30, 230)
    }

    fun create(statsModel: StatsModel): BottomBarVM {
        return BottomBarVM(statsModel.total, statsModel.checked_in, statsModel.checked_out)
    }
}