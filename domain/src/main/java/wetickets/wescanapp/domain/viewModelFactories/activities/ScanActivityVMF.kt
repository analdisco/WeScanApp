package wetickets.wescanapp.domain.viewModelFactories.activities

import wetickets.wescanapp.domain.viewModelFactories.BaseVMF
import wetickets.wescanapp.domain.viewModels.activities.ScanActivityVM

class ScanActivityVMF : BaseVMF<ScanActivityVM>() {
    override fun mock(): ScanActivityVM {
        val viewModel = ScanActivityVM()

        return viewModel
    }
}