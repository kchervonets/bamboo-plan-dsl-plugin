package dsls.plans

import dsls.plans.commons.MyUtilities


project('PROJECT') {
    name 'my project'

    def plan1 = plan('PLAN1') {
        name 'plan 1'
    }
    def plan2 = plan('PLAN2') {
        name 'plan 2'
    }
    MyUtilities.addCommonBranchSettings(plan1)
    MyUtilities.addCommonBranchSettings(plan2)
}